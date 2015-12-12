package com.challengers;

import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by darkstar on 12/9/15.
 */
public class TransactionControllerMathods {

    String baseUri;
    RestTemplate rest = new RestTemplate();

    public TransactionControllerMathods() {

        baseUri = "http://localhost:8084/transaction";

    }

    //Methods
    public void buyBook(Transaction transaction) {

        String uri = baseUri + "/buybook";
        System.out.println(uri);
        String result = rest.postForObject(uri, transaction, String.class);
        System.out.println(result);

    }

    public void getTransactionByDate(Long userId, String tranactionDate) {

        String uri = baseUri + "/gettransactions/" + userId + "/" + tranactionDate;
        Transaction [] result = rest.getForObject(uri, Transaction[].class);
        List<Transaction> transactions = Arrays.asList(result);

        for (Transaction i : transactions) {

            System.out.println(i);

        }
    }

    public void getAllTransactions(Long userId) {

        String uri = baseUri + "/gettransactions/" + userId;
        Transaction [] result = rest.getForObject(uri, Transaction[].class);
        List<Transaction> transactions = Arrays.asList(result);

        for (Transaction i : transactions) {

            System.out.println(i);

        }
    }
}
