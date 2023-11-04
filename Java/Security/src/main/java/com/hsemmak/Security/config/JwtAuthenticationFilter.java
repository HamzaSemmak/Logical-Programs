package com.hsemmak.Security.config;

import com.hsemmak.Security.service.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Override
    protected void doFilterInternal(
            @NotNull HttpServletRequest request,
            @NotNull HttpServletResponse response,
            @NotNull FilterChain filterChain
    ) throws ServletException, IOException {

        final String Header = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;

        if(Header == null ||  !Header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        jwt = Header.substring(7);
        userEmail = jwtService.extractUserName(jwt);
    }
}
