package ru.rgordeev.tkinvest;

import io.github.dankosik.starter.invest.annotation.marketdata.HandleCandle;
import io.github.dankosik.starter.invest.contract.marketdata.candle.BlockingCandleHandler;
import lombok.extern.slf4j.Slf4j;
import ru.tinkoff.piapi.contract.v1.Candle;
import ru.tinkoff.piapi.contract.v1.SubscriptionInterval;

@Slf4j
@HandleCandle(
        ticker = "SBER",
        subscriptionInterval = SubscriptionInterval.SUBSCRIPTION_INTERVAL_ONE_MINUTE
)
class BlockingHandler implements BlockingCandleHandler {

    private final PriceRepository priceRepository;

    BlockingHandler(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public void handleBlocking(Candle candle) {
        log.debug("Price is: {}", candle.getClose().getUnits());
        Price price = new Price();
        price.setInstrumentUid(candle.getInstrumentUid());
        price.setTime(candle.getTime().getSeconds());
        price.setClosen(candle.getClose().getNano());
        price.setCloseu(candle.getClose().getUnits());
        priceRepository.insert(price);
    }
}
