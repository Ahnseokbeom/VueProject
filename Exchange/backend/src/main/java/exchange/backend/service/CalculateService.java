package exchange.backend.service;

import org.springframework.stereotype.Service;

import exchange.backend.data.command.CalcCommand;
import exchange.backend.domain.Calculator;

import java.math.BigDecimal;

@Service
public class CalculateService {
    private final Calculator calculator = new Calculator();

    public BigDecimal calculateDelegate(CalcCommand command) {
        return calculator.calculate(command);
    }
}
