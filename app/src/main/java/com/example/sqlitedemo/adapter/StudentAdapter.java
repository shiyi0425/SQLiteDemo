package com.example.sqlitedemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sqlitedemo.R;
import com.example.sqlitedemo.entity.Student;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Student getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
            holder = new ViewHolder();

            holder.tvName = convertView.findViewById(R.id.tv_name);
            holder.tvAge = convertView.findViewById(R.id.tv_age);
            holder.tvClass = convertView.findViewById(R.id.tv_class);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Student student = students.get(position);
        holder.tvName.setText(student.getName());
        holder.tvAge.setText(String.valueOf(student.getAge()));
        holder.tvClass.setText(String.valueOf(student.getClass()));

        return convertView;
    }
    static class ViewHolder {
        TextView tvName;
        TextView tvAge;
        TextView tvClass;
    }
}
