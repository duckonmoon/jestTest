package service;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;

public class JestRestClient {

    private static JestRestClient jestRestClient = new JestRestClient();
    private JestClientFactory factory;

    private JestRestClient() {
        factory = new JestClientFactory();
        factory.setHttpClientConfig(new HttpClientConfig
                .Builder("http://localhost:9200")
                .multiThreaded(true)
                .build());

    }

    public static JestRestClient getInstance() {
        return jestRestClient;
    }

    public JestResult searchFromAccountNumber(int accId) throws IOException {
        JestClient client = factory.getObject();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("account_number", accId));


        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex("bank").build();

        SearchResult searchResult = client.execute(search);
        client.close();
        return searchResult;
    }

    public JestResult getFirstTenAccounts() throws  IOException{
        JestClient client = factory.getObject();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());


        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex("bank").build();

        SearchResult searchResult = client.execute(search);
        client.close();
        return searchResult;
    }
}
