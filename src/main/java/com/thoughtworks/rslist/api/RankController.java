package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.domain.Trade;
import com.thoughtworks.rslist.dto.TradeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class RankController {

    @Autowired
    RankService rankService;

    @PostMapping("/rs/rank/buy")
    public ResponseEntity<Trade> BuyRank(@RequestBody Trade trade) {
        TradeDto tradedto = TradeDto.builder()
                .amount(trade.getAmount())
                .rank(trade.getRank())
                .eventId(trade.getEventId())
                .build();
        return rankService.BuyRank(tradedto);
    }

    @GetMapping("/rs/rank/list")
    public ResponseEntity<List<Trade>> PurchaseList() {
        List<Trade> tradeList = rankService.findAll();
        return ResponseEntity.ok().body(tradeList);
    }
}
