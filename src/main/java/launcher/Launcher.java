package launcher;

import entity.BankAccount;
import io.searchbox.client.JestResult;
import service.JestRestClient;

import java.io.IOException;
import java.util.List;

public class Launcher {
    public static void main(String[] args) throws IOException {
        JestRestClient jestRestClient = JestRestClient.getInstance();

        JestResult searchResult = jestRestClient.getFirstTenAccounts();
        List<BankAccount> accounts = searchResult.getSourceAsObjectList(BankAccount.class);

        for (BankAccount acc:
             accounts) {
            System.out.println(acc);
        }

        System.out.println("\n");

        searchResult = jestRestClient.searchFromAccountNumber(20);
        BankAccount account = searchResult.getSourceAsObject(BankAccount.class);

        System.out.println(account);
    }
}
