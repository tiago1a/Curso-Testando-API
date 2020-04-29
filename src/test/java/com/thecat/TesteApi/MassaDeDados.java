package com.thecat.TesteApi;

public class MassaDeDados {
	String vote_id;
	String urlCadastro = "user/passwordlesssignup"; 
	String corpoCadastro = "{\"email\": \"tiagoamaro01@gmail.com\", \"appDescription\": \"teste the cat api\"}";
	String corpoVotacao = "{\"image_id\": \"2fg\", \"value\": \"true\", \"sub_id\": \"demo-a3320d\"}";
	String corpoFavorita = "{ \"image_id\": \"2uo\"}";
	String corpoDesfavorita = "favourites/{favourite_id}";
}
