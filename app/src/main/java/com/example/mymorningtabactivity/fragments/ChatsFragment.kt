package com.example.mymorningtabactivity.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.mymorningtabactivity.CustomAdapter
import com.example.mymorningtabactivity.R
import com.example.mymorningtabactivity.User

class ChatsFragment : Fragment() {

    var mList: ListView?= null
    var users:ArrayList<User> ?= null
    var adapter: CustomAdapter?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_chats, container, false)
        return root
    }mList = findViewById(R.id.mListView)
    users = ArrayList()
    adapter = CustomAdapter(context,users!!)
    //start creating users
    var user1 = User(R.mipmap.nice,"molly","0785435162")
    var user2 = User(R.mipmap.flower,"molly","0785435162")
    var user3 = User(R.mipmap.nice,"molly","0785435162")
    var user4 = User(R.mipmap.nice,"molly","0785435162")
    var user5 = User(R.mipmap.love,"molly","0785435162")
    var user6 = User(R.mipmap.nice,"molly","0785435162")
    var user7 = User(R.mipmap.flower,"molly","0785435162")
    var user8 = User(R.mipmap.nice,"molly","0785435162")
    var user9 = User(R.mipmap.love,"molly","0785435162")
    //Add the created users to the arraylist users
    users!!.add(user1)
    users!!.add(user2)
    users!!.add(user3)
    users!!.add(user4)
    users!!.add(user5)
    users!!.add(user6)
    users!!.add(user7)
    users!!.add(user8)
    users!!.add(user9)
    //Assign our custom adapter to the listview
    mList!!.adapter = adapter!!


}
//implement a custom listview