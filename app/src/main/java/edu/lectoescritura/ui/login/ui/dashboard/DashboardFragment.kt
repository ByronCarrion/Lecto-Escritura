package edu.lectoescritura.ui.login.ui.dashboard

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
import edu.lectoescritura.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val button1: Button = binding.btn1
        val button2: Button = binding.btn2
        val button3: Button = binding.btn3
        val button4: Button = binding.btn4
        val button5: Button = binding.btn5
        val button6: Button = binding.btn6


        button2.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni1Lite1::class.java)
            startActivity(intent)


        })

        button5.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni1Lite3::class.java)
            startActivity(intent)


        })
        button3.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity, Uni1Lite4::class.java)
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