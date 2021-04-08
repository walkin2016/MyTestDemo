package com.post;

//import com.xhhd.common.utils.HttpUtils;
//import com.xhhd.common.utils.encodeUtil;
//import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
//    private static final String P360_LOGIN_KEY = "wFLZVzvgfVD7mlpmcWVlPxqFmYsx8dX1";
//
//    public static void test1() {
//        String gkey = "tcol";
//        String server_id = "S99";
//        String qid = "2847507268";
//        String name = "[99]方梅英";
//        String ip = "182.142.175.113";
//        String toqid = "";
//        String toname = "";
//        int type = 8;
//        String msg = "某抡商+  淘";
//
//        HashMap<String, String> params = new HashMap<>();
//        params.put("server_id", server_id + "");//是创建服还是当前服
//        params.put("qid", qid);
//        params.put("name", URLEncoder.encode(name));
//
//        params.put("type", type + "");
//        params.put("toqid", toqid);
//        params.put("toname", URLEncoder.encode(toname));
//        params.put("content", URLEncoder.encode(msg));
//        params.put("ip", ip);
//        String md5key = "wFLZVzvgfVD7mlpmcWVlPxqFmYsx8dX1";
//        long time = 1503331200;
//        String sign = encodeUtil.md5(gkey + server_id + qid + name + type + toqid + toname + msg + time + ip + md5key);
//        params.put("sign", sign);
//
//        System.out.println("sign:" + sign);
//        String result = HttpUtils.URLPost("http://game.api.1360.com/chat", params);
//
//        System.out.println("360聊天上报：" + result);
//    }
//
//    public static void test2() throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        String gender = "m";
//        String gkey = "tcol";
//        String job = "A";
//        String level = "100";
//        String name = "方梅英";
//        String playid = "12312";
//        String qid = "2847507268";
//        String server_id = "S99";
//        String key = "wFLZVzvgfVD7mlpmcWVlPxqFmYsx8dX1";
//
//        String signStr = gender + gkey + job + level + name + playid + qid + server_id + key;
//        System.out.println("签名字符串:" +signStr);
//        String sign = encodeUtil.md5(signStr);
//        System.out.println("sign: " + sign);
//        System.out.println("nameEncoder: " + URLEncoder.encode(name));
//
//        HashMap<String, String> params = new LinkedHashMap<>();
//        params.put("gender", URLEncoder.encode(gender));
//        params.put("gkey", URLEncoder.encode(gkey));
//        params.put("job", URLEncoder.encode(job));
//        params.put("level", URLEncoder.encode(level));
//        params.put("name", URLEncoder.encode(name));
//        params.put("playid", URLEncoder.encode(playid));
//        params.put("qid", URLEncoder.encode(qid));
//        params.put("server_id", URLEncoder.encode(server_id));
//        params.put("sign", URLEncoder.encode(sign));
//        String result = HttpUtils.URLPost("http://game.api.1360.com/player", params);
//
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, String> entry : params.entrySet()){
//            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
//        }
//        System.out.println(sb.toString());
//
//        System.out.println(result);
//        System.out.println(URLEncoder.encode(name));
//    }
//
//    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        test2();
//    }
//
//
//    public static String getMD5Str(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        byte[] digest = null;
//        try {
//            MessageDigest md5 = MessageDigest.getInstance("md5");
//            digest  = md5.digest(str.getBytes("utf-8"));
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        //16是表示转换为16进制数
//        String md5Str = new String(Hex.encodeHex(digest));
//        return md5Str;
//    }

}
