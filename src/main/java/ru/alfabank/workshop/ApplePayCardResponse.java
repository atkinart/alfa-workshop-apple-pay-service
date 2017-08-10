package ru.alfabank.workshop;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ApplePayCardResponse {
    @Singular
    private List<String> cards;
    private String token;
}
