package br.com.dalcim.picpay.data.local;

import java.util.List;

import br.com.dalcim.picpay.data.CreditCard;

/**
 * @author Wiliam
 * @since 29/08/2017
 */

public interface RepositoryLocal {
    List<CreditCard> getCreditCards();
}