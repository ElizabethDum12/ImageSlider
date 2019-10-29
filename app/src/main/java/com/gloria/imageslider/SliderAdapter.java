package com.gloria.imageslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        //viewHolder.textViewDescription.setText("This is slider item " + position);

        switch (position) {
            case 0:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.homemerkett)
                        .into(viewHolder.imageView);
                break;
            case 1:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.phone)
                        .into(viewHolder.imageView);
                break;
            case 2:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.phonenext)
                        .into(viewHolder.imageView);
                break;

            case 3:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.freshfruits)
                        .into(viewHolder.imageView);
                break;
            case 4:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.freshboisson)
                        .into(viewHolder.imageView);
                break;
            case 5:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.methodpayment)
                        .into(viewHolder.imageView);
                case 6:
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.fastdelivery)
                        .into(viewHolder.imageView);
                break;
            default:


        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 6;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        View itemView;
        ImageView imageView;


        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            this.itemView = itemView;
        }
    }
}
