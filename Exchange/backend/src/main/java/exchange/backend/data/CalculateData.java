package exchange.backend.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

import exchange.backend.data.command.CalcCommand;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;

public class CalculateData {

    @ToString
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Req {
        public static final String CORRECT_NUMBER = "\\d+(\\.\\d+)?";

        @Max(10_000)
        @Pattern(regexp = CORRECT_NUMBER)
        private String fromAmount;

        @Pattern(regexp = CORRECT_NUMBER)
        private String currencyAmount;

        public CalcCommand toCommand() {
            return new CalcCommand(new BigDecimal(fromAmount), new BigDecimal(currencyAmount));
        }
    }

    @ToString
    @Getter
    @AllArgsConstructor
    public static class Res {
        private boolean success;
        private BigDecimal result;
    }
}
