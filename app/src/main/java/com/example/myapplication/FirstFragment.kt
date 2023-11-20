package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding
    lateinit var adapter: RecipeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = ArrayList<Recipe>()
        list.add(Recipe("Zelda", " Adventure", "2017", "Nintendo"))
        list.add(Recipe("Fortnite", " Battle", "2017", "Epic Games"))
        list.add(Recipe("Mario Kart", " Arcade", "2018", "Rockstar Studios"))
        list.add(Recipe("Overwatch", " Shooter", "2016", "Blizzard"))
        list.add(Recipe("The Witcher", " RPG", "2015", "Projekt Red"))

        adapter = RecipeAdapter() { recipe, position ->
            findNavController().navigate(
                FirstFragmentDirections.toSecondFragment(
                    recipe.name,
                    recipe.type,
                    recipe.year,
                    recipe.studio
                )
            )
            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT)
                .show()
        }
        adapter.setList(list)
        binding.rv.adapter = adapter

        binding.firstBtnToSecond.setOnClickListener {

            findNavController().navigate(
                FirstFragmentDirections.toSecondFragment(
                    "Name",
                    "Type",
                    "Release",
                    "Studio"
                )
            )
        }
    }
}