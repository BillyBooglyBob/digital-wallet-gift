package com.william.digitalwalletgift;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    public void insertWallet(Wallet wallet) {
        walletRepository.save(wallet);
    }

    public Wallet getAllWalletById(Integer id) {
        return walletRepository
                .findById(id)
                .orElseThrow(() -> new IllegalAccessError(id + "not found"));
    }
}
