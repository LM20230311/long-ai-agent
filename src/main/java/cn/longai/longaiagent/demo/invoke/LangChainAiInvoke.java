package cn.longai.longaiagent.demo.invoke;

import cn.hutool.core.io.resource.ResourceUtil;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

import java.net.URL;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        URL resource = ResourceUtil.getResource("spring.ai.dashscope.api-key");
        System.out.println(resource);
//        ChatLanguageModel qwenModel = QwenChatModel.builder()
//                .apiKey(TestApiKey.API_KEY)
//                .modelName("qwen-max")
//                .build();
//        String answer = qwenModel.chat("我是龙猫，正在学习AIAgent的java实战项目，给我一点建议！");
//        System.out.println(answer);
    }
}
