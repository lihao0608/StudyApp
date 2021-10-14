package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.widget.TextView;

import com.example.studyapp.java.A;
import com.example.studyapp.java.Amanger;
import com.example.studyapp.java.Callback;
import com.example.studyapp.java.CallbackIml;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<String> linkedList=new LinkedList<>();
//        linkedList.get();
        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.get()
        ArrayMap<String,String> arrayMap=new ArrayMap<>();


//       startActivity(new Intent(MainActivity.this,MainActivity2.class));

//        EventBus.getDefault().register(this);

//        Math.pow()

        int[][] matrix={{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
        spiralOrder(matrix);
        Log.d("TAG", "onCreate: "+ Arrays.toString(spiralOrder(matrix)));

        int a=1;
        double b=a;
        Log.d("11111111111111111", "onCreate: "+b);

        PackageManager pm = getPackageManager();
//        List<PackageInfo> installedPackages = pm.getInstalledPackages();

        setCallBack(new CallbackIml());

    }

    void setCallBack(Callback callback){
        if (callback instanceof CallbackIml){

        }

    }


    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++) {
                res[x++] = matrix[t][i]; // left to right.
            }
            if(++t > b) {
                break;
            }
            for(int i = t; i <= b; i++) {
                res[x++] = matrix[i][r]; // top to bottom.
            }
            if(l > --r) {
                break;
            }
            for(int i = r; i >= l; i--) {
                res[x++] = matrix[b][i]; // right to left.
            }
            if(t > --b) {
                break;
            }
            for(int i = b; i >= t; i--) {
                res[x++] = matrix[i][l]; // bottom to top.
            }
            if(++l > r) {
                break;
            }
        }
        return res;
    }



//    private static List<PackageInfo> forceGetPackageList(Context context) {
//        PackageManager pm = context.getPackageManager();
//        List<PackageInfo> mList = new ArrayList<>();
//
//        //系统应用uid从1000开始，用户应用uid从10000(FIRST_APPLICATION_UID)开始，直接合并查询
//        for (int i = Process.SYSTEM_UID; i <= Process.LAST_APPLICATION_UID; i++) {
//            String[] apps = null;
//            try {
//                apps = pm.getPackagesForUid(i);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            if (apps != null) {
//                for (String app : apps) {
//                    try {
//                        PackageInfo info = pm.getPackageInfo(app, 0);
//                        if (info != null) {
//                            mList.add(info);
//                        }
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//        return mList;
//    }

}
