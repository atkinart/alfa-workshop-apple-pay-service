package ru.alfabank.workshop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RefreshScope
@Data
@ConfigurationProperties()
public class CardConfiguration {
    private List<String> appleCards;
}
