package com.example.jiayuanfa.mytabbartest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    private String content;

    /**
     * 构造方法：因为Fragment是组件，所以参考官网的示例，这么写
     * */
    public static MyFragment newInstance(String name) {
        MyFragment newFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        newFragment.setArguments(bundle);
        return newFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText(content);

        // 取出Activity传递过来的值并设置到TextView上
        Bundle args = getArguments();
        if (args != null) {
            content = args.getString("name");
            txt_content.setText(content);
        }
        return view;
    }

}
