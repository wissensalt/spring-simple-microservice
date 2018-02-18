package com.zisal.client.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class RemoteAccountRepository implements AccountRepository {

    @Autowired
    private IAccountApiClient accountApiClient;

    @Override
    public List<Account> getAllAccounts() {
        return accountApiClient.getAllAccounts();
    }

    @Override
    public Account getAccount(String number) {
        return accountApiClient.getAccount(number);
    }

}
