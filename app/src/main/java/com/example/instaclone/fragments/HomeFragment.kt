package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.*
import com.example.instaclone.adapter.InstaPostAdapter
import com.example.instaclone.adapter.StoriesAdapter
import com.example.instaclone.dataclasses.InstaPost
import com.example.instaclone.dataclasses.Story
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showStories()
        showPosts()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home_top_menu,menu)
    }

    fun showStories(){
        val storiesList=ArrayList<Story>()
        storiesList.add(Story("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Jenny"))
        storiesList.add(Story("https://www.online-image-editor.com/styles/2019/images/power_girl.png","Starr"))
        storiesList.add(Story("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Beck"))
        storiesList.add(Story("https://e7.pngegg.com/pngimages/141/512/png-clipart-sofia-martinez-book-the-marigold-mess-drawing-illustration-cartoon-girl-fashion-girl-fashion.png","Catt"))
        storiesList.add(Story("https://www.online-image-editor.com/styles/2019/images/power_girl.png","Tristy"))
        storiesList.add(Story("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSjKMqpnAtRp36_7v0mjQwHnim0mzphjC0oog&usqp=CAU","Tristan"))
        storiesList.add(Story("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSjKMqpnAtRp36_7v0mjQwHnim0mzphjC0oog&usqp=CAU","Lovely"))
        storiesList.add(Story("https://i0.wp.com/kimillustration.com/wp-content/uploads/2019/09/Cover_Beach_02.jpg?fit=419%2C501&ssl=1","Kaycee rice"))
        storiesList.add(Story("https://i.pinimg.com/236x/bd/7c/a2/bd7ca240fe6f9cf93899e82084dfa02c--flat-illustration-illustrations.jpg","Bailey Sok"))
        storiesList.add(Story("https://i.pinimg.com/236x/bd/7c/a2/bd7ca240fe6f9cf93899e82084dfa02c--flat-illustration-illustrations.jpg","Shee babez"))

        val storiesAdapter= StoriesAdapter(storiesList)
        rvStories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvStories.adapter=storiesAdapter
    }

    fun showPosts(){
        val instaPostList=ArrayList<InstaPost>()
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","mia_Mugs","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
        100,"Throw negativity to the trash ang get on with life.#yolo")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Beck","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            500,"You look nice...gal!")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Sonnie","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            500,"Take care ya'll")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Bianca","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            3000,"Living my life to the fullest")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Nickie","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            500,"Looking like a snack")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Lian","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            674,"Be yourself,don't fake it")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Maddie","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            800,"Think positive,eat positive,live positive")
        )
        instaPostList.add(
            InstaPost("https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616","Singh","https://media.gettyimages.com/photos/mia-mugavero-attends-the-promgirl-celebrates-their-rated-pg-launch-picture-id1202001616",
            900,"Everyday is a blessing")
        )

        val instaPostAdapter= InstaPostAdapter(instaPostList)
        rvPosts.layoutManager=LinearLayoutManager(context)
        rvPosts.adapter=instaPostAdapter
    }
}

