package com.fian.crevtorage.myrecyclerview;

/**
 * Created by crevtorage on 10/16/2017.
 */

import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
        import com.bumptech.glide.Glide;

public class DetailPresidentAdapter  extends Activity {
    String nama_negara,remarks_negara,remarks_nationality,remarks_desc;
    TextView namaNegara,remarksNegara,remarksNationality,remarksDesc;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // xml layoutnya activity_detail_negara
        setContentView(R.layout.item_detail_president);

        // ambil textview nama_negara dan info_negara
        namaNegara=(TextView) findViewById(R.id.tv_item_name);
        remarksNegara=(TextView) findViewById(R.id.tv_item_remarks);
        imgPhoto = (ImageView) findViewById(R.id.img_item_photo);
        remarksNationality = (TextView) findViewById(R.id.tv_item_nationality);
        remarksDesc= (TextView) findViewById(R.id.tv_item_desc);
        // ambil parameter nama_negara dari intent
        Intent intent = getIntent();
        nama_negara = intent.getStringExtra("name");
        remarks_negara = intent.getStringExtra("remarks");
        remarks_nationality = intent.getStringExtra("nationality");
        remarks_desc = intent.getStringExtra("desc");
        Glide.with(this).load(getIntent().getStringExtra("photo")).into(imgPhoto);

     //   img_photo=intent.getStringExtra("photo");
        // tampilkan nama negara di TextView nama negara
        namaNegara.setText(nama_negara);
        remarksNegara.setText(remarks_negara);
        remarksNationality.setText(remarks_nationality);
        remarksDesc.setText(remarks_desc);

    }


}