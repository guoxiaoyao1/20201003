package com.example.zuoye007.bean;

import com.example.zuoye007.R;
import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "国誉笔记本", "单肩包", "乐町连衣裙", "法式毛衣", "日本线香", "国誉标签贴", "蛋糕", "丝巾"

    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "日本国誉笔记本插画师系列夏日限定",
            "现货单肩包书袋草莓贝壳玫瑰帆布",
            "乐町连衣裙女2020新款夏季紫色纯棉牛仔裙",
            "法式慵懒风日系古着甜美软奶蓝可爱毛衣秋冬",
            "日本京都香彩堂线香吉祥物系列",
            "日本国誉文具鸟系列标签贴",
            "裸蛋糕九合一",
            "可盐可甜百搭文艺丝巾小方巾领巾发带"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {14, 178, 179, 258, 58, 9,399,31};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a_s,R.drawable.b_s,R.drawable.i_s,R.drawable.d_s,R.drawable.e_s,R.drawable.f_s,R.drawable.g_s,R.drawable.h_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a,R.drawable.b,R.drawable.i,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
