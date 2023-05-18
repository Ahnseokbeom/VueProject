package exchange.backend.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "exchange")
@Getter
public class ConfigProperties {

    @jakarta.validation.constraints.NotEmpty
    private final String accessKey;

    @jakarta.validation.constraints.NotEmpty
    @jakarta.validation.constraints.Min(1)
    private final String[] currencies;

    public ConfigProperties(String accessKey, String[] currencies) {
        this.accessKey = accessKey;
        this.currencies = currencies;
    }
}
