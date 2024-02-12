package com.example.update_master_of_guitar.Fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.update_master_of_guitar.R
import com.example.update_master_of_guitar.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val nombre = binding.eTnombre.text.toString()

            // Create a bundle to pass the name as an argument
            val bundle = Bundle()
            bundle.putString("nombre", nombre)

            // Navigate to the second fragment with the bundle
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }
    }
}



