package edu.lectoescritura.ui.login.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import edu.lectoescritura.Unidad.Unidad1.*
import edu.lectoescritura.Unidad.Unidad3.Uni3Lite2
import edu.lectoescritura.databinding.FragmentHomeBinding
import edu.lectoescritura.lectura.lectura1
import edu.lectoescritura.lectura.lectura2
import edu.lectoescritura.lectura.lectura3


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val button1: Button = binding.btn1
        val button2: Button = binding.btn2
        val button3: Button = binding.btn3
        val button4: Button = binding.btn4
        val button5: Button = binding.btn5
        val button6: Button = binding.btn6


        button2.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, lectura1::class.java)
            startActivity(intent)


        })

        button5.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, lectura2::class.java)
            startActivity(intent)


        })
        button3.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, lectura3::class.java)
            startActivity(intent)


        })
        button1.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni1Lite5::class.java)
            startActivity(intent)


        })
        button4.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni1Lite6::class.java)
            startActivity(intent)


        })
        button6.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni3Lite2::class.java)
            startActivity(intent)


        })
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}