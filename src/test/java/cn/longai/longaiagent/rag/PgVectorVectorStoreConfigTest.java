package cn.longai.longaiagent.rag;


import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;


/**
 * @version 1.0
 * @ClassName PgVectorVectorStoreConfigTest
 * @Description: TODO
 * @Author: likunlong
 * @Date: 2025/5/23 18:28
 */
@SpringBootTest
public class PgVectorVectorStoreConfigTest {

    @Resource
    VectorStore pgVectorVectorStore;

    @Test
    void test() {
        // 相似度查询
        List<Document> results = pgVectorVectorStore.similaritySearch(SearchRequest.builder().query("我已经结婚了，但是婚后关系不太亲密，怎么办？").topK(5).build());
        Assertions.assertNotNull(results);
    }
}