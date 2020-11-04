package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.instaclone.MainActivity
import com.example.instaclone.R
import com.example.instaclone.dataclasses.Highlights
import kotlinx.android.synthetic.main.fragment_home.*


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showHighlights()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.profile_middle_menu,menu)
    }
    fun showHighlights() {
        val profileHiglights = ArrayList<Highlights>()
        profileHiglights.add(Highlights("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Shee"))
        profileHiglights.add(Highlights("https://www.google.com/url?sa=i&url=https%3A%2F%2Fredllama.media%2Fwork&psig=AOvVaw0a0Myb_bStcVDzXP5XYtSF&ust=1604527750910000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLCXsfex5-wCFQAAAAAdAAAAABAQ","Shee"))
        profileHiglights.add(Highlights("https://www.google.com/url?sa=i&url=https%3A%2F%2Fredllama.media%2Fwork&psig=AOvVaw0a0Myb_bStcVDzXP5XYtSF&ust=1604527750910000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLCXsfex5-wCFQAAAAAdAAAAABAQ","Shee"))
        profileHiglights.add(Highlights("https://www.google.com/url?sa=i&url=https%3A%2F%2Fredllama.media%2Fwork&psig=AOvVaw0a0Myb_bStcVDzXP5XYtSF&ust=1604527750910000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLCXsfex5-wCFQAAAAAdAAAAABAQ","shee"))

}

    }
