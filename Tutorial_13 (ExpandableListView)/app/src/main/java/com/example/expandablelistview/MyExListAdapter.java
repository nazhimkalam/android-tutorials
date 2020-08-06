package com.example.expandablelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

// ExpandableListAdapter is an Interface which uses an abstract class called BaseExpandableListAdapter
// we have to create our own class to implement this BaseExpandableListAdapter.

public class MyExListAdapter extends BaseExpandableListAdapter {
    Context context;

    public MyExListAdapter(Context context, List<String> languages, Map<String, List<String>> topics) {
        this.context = context;
        this.languages = languages;
        this.topics = topics;
    }

    List<String> languages;
    Map<String, List<String>> topics;

    @Override
    public int getGroupCount() {  // groups are the parent strings which are the languages
        return languages.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return topics.get(languages.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return languages.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return topics.get(languages.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    //  this is the important section ------------
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String language = (String) getGroup(groupPosition);  // returns the group name

        if(convertView == null){    // we check if the convert view is null then add the layout to inflate
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent, null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.txtParent);
        txtParent.setText(language);

        return convertView;
    }

    //  this is the important section ------------
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String topic = (String) getChild(groupPosition, childPosition);  // returns the group name

        if(convertView == null){    // we check if the convert view is null then add the layout to inflate
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child, null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.txtChild);
        txtParent.setText(topic);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
