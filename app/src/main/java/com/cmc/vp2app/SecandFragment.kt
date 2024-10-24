package com.cmc.vp2app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class SecandFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterRecycle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_secand, container, false)

        recyclerView = view.findViewById(R.id.recycle_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val countryList = mutableListOf(
            Countries("Morocco", R.drawable.morocco),
            Countries("Belgium", R.drawable.belgium),
            Countries("Canada", R.drawable.canada),
            Countries("France", R.drawable.france),
            Countries("Italy", R.drawable.italy)
        )

        adapter = AdapterRecycle(requireContext(), countryList.toMutableList()) { country ->
            Snackbar.make(view, "Selected: ${country.name}", Snackbar.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
        adapter.updateList(countryList)

        return view
    }
}
