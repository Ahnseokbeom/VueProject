package exchange.backend.data.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class CalcCommand {
    public CalcCommand(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
		// TODO Auto-generated constructor stub
	}
	private final BigDecimal fromAmount = null;
    private final BigDecimal currencyAmount = null;
	public BigDecimal getCurrencyAmount() {
		// TODO Auto-generated method stub
		return null;
	}
	public BigDecimal getFromAmount() {
		// TODO Auto-generated method stub
		return null;
	}
}
