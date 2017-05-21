package com.dianping.sparrow.rpc.config;

import java.util.Map;

/**
 * Created by andy on 17/5/13.
 */
public class ProtocolConfig extends AbstractConfig {
    // 服务协议
    private String              name;

    // 服务IP地址(多网卡时使用)
    private String              host;

    // 服务端口
    private Integer             port;

    // 上下文路径
    private String              contextpath;

    // 线程池类型
    private String              threadpool;

    // 线程池大小(固定大小)
    private Integer             threads;

    // IO线程池大小(固定大小)
    private Integer             iothreads;

    // 线程池队列大小
    private Integer             queues;

    // 最大接收连接数
    private Integer             accepts;

    // 协议编码
    private String              codec;

    // 序列化方式
    private String              serialization;

    // 字符集
    private String              charset;

    // 最大请求数据长度
    private Integer             payload;

    // 缓存区大小
    private Integer             buffer;

    // 心跳间隔
    private Integer             heartbeat;

    // 访问日志
    private String              accesslog;

    // 网络传输方式
    private String              transporter;

    // 信息交换方式
    private String              exchanger;

    // 信息线程模型派发方式
    private String              dispatcher;

    // 对称网络组网方式
    private String              networker;

    // 服务器端实现
    private String              server;

    // 客户端实现
    private String              client;

    // 支持的telnet命令，多个命令用逗号分隔
    private String              telnet;

    // 命令行提示符
    private String              prompt;

    // status检查
    private String              status;

    // 是否注册
    private Boolean             register;

    // 参数
    private Map<String, String> parameters;

    // 是否为缺省
    private Boolean isDefault;
}
