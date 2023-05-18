package exchange.backend.domain;

import java.math.BigDecimal;

import exchange.backend.data.command.CalcCommand;

//domain
public class Calculator {

 public BigDecimal calculate(CalcCommand command) {
     return command.getCurrencyAmount().multiply(command.getFromAmount());
 }
}
