package com.example.myapplication5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(
        view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton: Button =
            view.findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            findNavController().
            navigate(R.id.action_loginFragment_to_homeFragment)
        }
    }
}