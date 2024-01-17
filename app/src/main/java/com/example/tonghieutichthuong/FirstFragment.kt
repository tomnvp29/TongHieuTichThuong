package com.example.tonghieutichthuong

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tonghieutichthuong.databinding.FragmentFirstBinding
import kotlin.math.roundToInt

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttongiaiphuongtrinh.setOnClickListener {
            val a: Double = binding.editTexta.text.toString().toDouble()
            val b: Double = binding.editTextb.text.toString().toDouble()
            val c: Double = binding.editTextc.text.toString().toDouble()
            val delta: Double = (b * b) - (4 * ( a * c ))
            if(delta < 0){
                println("Phương trình vô nghiệm")
            }
            else if(delta == 0.0){
                println("""
                    Phương trình có nghiệm kép: 
                    x = ${-b / (2*a)}
                """.trimIndent())
            }
            else{
                println("""
                    Phương trình có 2 nghiệm phân biệt: 
                    x1 = ${(-b + Math.sqrt(delta)) / (2 * a)}
                    x2 = ${(-b - Math.sqrt(delta)) / (2 * a)}
                """.trimIndent())
                println("ngoc khung dien")
                println("ngoc khung dien")
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}