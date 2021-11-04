package com.example.poctransfer.config;

import com.example.poctransfer.business.strategy.CreateTransferStrategy;
import com.example.poctransfer.ports.CreateTransactionPort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StrategyConfig {

    @Bean
    public CreateTransferStrategy createTransferStrategy(@Qualifier("prismaCreateTransactionPort") CreateTransactionPort createTransactionPort) {
        return new AltrctaCreateTransactionStrategy(createTransactionPort);
    }
}
