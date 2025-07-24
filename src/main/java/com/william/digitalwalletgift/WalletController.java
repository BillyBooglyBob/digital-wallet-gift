package com.william.digitalwalletgift;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping
    public List<Wallet> getWallets() {
        return walletService.getAllWallets();
    }

    @GetMapping("{id}")
    public Wallet getWalletById(@PathVariable Integer id) {
        return walletService.getAllWalletById(id);
    }

    @PostMapping
    public void addWallet(@RequestBody Wallet wallet) {
        walletService.insertWallet(wallet);
    }

}
