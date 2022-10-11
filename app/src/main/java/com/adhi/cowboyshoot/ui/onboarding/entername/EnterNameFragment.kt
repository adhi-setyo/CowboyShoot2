package com.adhi.cowboyshoot.ui.onboarding.entername

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.adhi.cowboyshoot.R
import com.adhi.cowboyshoot.databinding.FragmentEnterNameBinding
import com.adhi.cowboyshoot.ui.menuactivity.MenuActivity
import com.adhi.cowboyshoot.ui.onboarding.OnFinishNavigateListener

class EnterNameFragment : Fragment(), OnFinishNavigateListener{

    private lateinit var binding: FragmentEnterNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEnterNameBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onFinishNavigateListener(){
        val name = binding.etName.text.toString().trim()
        if(name.isEmpty()){
            //Toast.makeText(requireContext(),"Please input your name :", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(),"Please input your name :", Toast.LENGTH_SHORT).show()
        }else{
            navigateToMenu(name)
        }
    }

    private fun navigateToMenu(name : String) {
        val intent = Intent(requireContext(), MenuActivity::class.java)
        intent.putExtra("name", "HI $name!!")
        startActivity(intent)
        //Toast.makeText(requireContext(),"name : $name", Toast.LENGTH_SHORT).show()
    }

}