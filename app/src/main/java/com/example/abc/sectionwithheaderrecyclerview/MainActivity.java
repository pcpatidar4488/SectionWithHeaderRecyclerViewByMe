package com.example.abc.sectionwithheaderrecyclerview;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view){
        startRecyclerViewActivity(RecyclerViewType.LINEAR_VERTICAL);
    }

    public void linearSectionedRecyclerViewVertical(View view) {
        startRecyclerViewActivity(RecyclerViewType.LINEAR_VERTICAL);
    }

    public void linearSectionedRecyclerViewHorizontal(View view) {
        startRecyclerViewActivity(RecyclerViewType.LINEAR_HORIZONTAL);
    }

    public void gridSectionedRecyclerView(View view) {
        startRecyclerViewActivity(RecyclerViewType.GRID);
    }

    private void startRecyclerViewActivity(RecyclerViewType recyclerViewType) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(RecyclerViewActivity.RECYCLER_VIEW_TYPE, recyclerViewType);
        startActivity(new Intent(this, RecyclerViewActivity.class).putExtras(bundle));
    }
}