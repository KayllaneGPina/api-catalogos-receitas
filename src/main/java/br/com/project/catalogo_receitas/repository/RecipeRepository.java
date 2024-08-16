package br.com.project.catalogo_receitas.repository;

import br.com.project.catalogo_receitas.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
