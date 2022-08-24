package org.battery.controller.util.restTemplate

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusRequest
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusResponse
import org.battery.controller.util.controller.register.Register
import org.battery.controller.util.manufacturers.enums.Manufacturer
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate

/**
 *
 */
object RestControllerTemplate {

    // TODO put into application.properties when moving in own repository
    private const val baseGetUrl = "http://localhost:8081/connector/get?command="
    private const val basePostUrl = "http://localhost:8081/connector/post?command="
    private val logger = LoggerFactory.getLogger(this::class.java)

    /**
     *
     */
    fun sendCommand(request: ModbusRequest, manufacturer: Manufacturer): ModbusResponse {
        val response = when {
            request.command.accessType.isRead() ->
                sendGetCommand(
                    command = request.command,
                    manufacturer = manufacturer
                )

            request.command.accessType.isReadAndWrite() && request.value.isEmpty() ->
                sendGetCommand(
                    command = request.command,
                    manufacturer = manufacturer
                )

            else -> sendPostCommand(request = request, manufacturer = manufacturer)
        }

        return ModbusResponse(command = request.command, value = response.body)
    }

    private fun sendGetCommand(command: ModbusCommand, manufacturer: Manufacturer): ResponseEntity<Register> {
        val getUrl = baseGetUrl + command.name + "&=manufacturer$manufacturer"
        logger.info("Sending GET request to URL '$getUrl'")
        return RestTemplate().getForEntity(getUrl, Register::class.java)
    }

    private fun sendPostCommand(request: ModbusRequest, manufacturer: Manufacturer): ResponseEntity<Register> {
        val postUrl = basePostUrl + request.command.name + "&=value${request.value}" + "&=manufacturer$manufacturer"
        logger.info("Sending POST request to URL '$postUrl'")
        return RestTemplate().postForEntity(postUrl, null, Register::class.java)
    }
}
