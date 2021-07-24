package edu.lectoescritura.ui.login.ui.diccionario

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import edu.lectoescritura.R
import edu.lectoescritura.databinding.ActivityDiccionarioBinding


class DiccionarioFragment : Fragment() {

    private lateinit var diccionarioViewModel: DiccionarioViewModel
    private var _binding: ActivityDiccionarioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        diccionarioViewModel  =
            ViewModelProvider(this).get(DiccionarioViewModel::class.java)

        _binding = ActivityDiccionarioBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val textView: TextView = binding.textDiccionario
        diccionarioViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val a: ImageView = binding.a
        val b: ImageView = binding.b
        val c: ImageView = binding.c
        val d: ImageView = binding.d
        val e: ImageView = binding.e
        val f: ImageView = binding.f
        val g: ImageView = binding.g
        val h: ImageView = binding.h
        val i: ImageView = binding.i
        val j: ImageView = binding.j


        Glide.with(activity).load(R.drawable.a).into(a)
        Glide.with(activity).load(R.drawable.b).into(b)
        Glide.with(activity).load(R.drawable.c).into(c)
        Glide.with(activity).load(R.drawable.d).into(d)
        Glide.with(activity).load(R.drawable.e).into(e)
        Glide.with(activity).load(R.drawable.f).into(f)
        Glide.with(activity).load(R.drawable.g).into(g)
        Glide.with(activity).load(R.drawable.h).into(h)
        Glide.with(activity).load(R.drawable.i).into(i)
        Glide.with(activity).load(R.drawable.j).into(j)




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}