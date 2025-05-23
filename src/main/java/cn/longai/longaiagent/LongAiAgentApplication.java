package cn.longai.longaiagent;

import cn.longai.longaiagent.rag.PgVectorVectorStoreConfig;
import org.springframework.ai.autoconfigure.vectorstore.pgvector.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PgVectorStoreAutoConfiguration.class)
public class LongAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(LongAiAgentApplication.class, args);
    }

}
