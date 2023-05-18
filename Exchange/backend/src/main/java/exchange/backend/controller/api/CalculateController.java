package exchange.backend.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import exchange.backend.data.CalculateData;
import exchange.backend.service.CalculateService;
import jakarta.validation.Valid;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping("/calculate")
    public CalculateData.Res calculate(@RequestBody @Valid CalculateData.Req req) {
        BigDecimal result = calculateService.calculateDelegate(req.toCommand());
        return new CalculateData.Res(true, result);
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CalculateData.Res notValidArgument() {
        return new CalculateData.Res(false, null);
    }
}
