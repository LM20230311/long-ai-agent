package cn.longai.longaiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(ApiKeyUtil.getApplicationValue("api-key"))
                .modelName("qwen-max")
                .build();
        String answer = qwenModel.chat("我是龙猫，正在学习AIAgent的java实战项目，给我一点建议！");
        System.out.println(answer);
    }
}
