package com.flip.connect.domain.usecase.edition;

import com.flip.connect.data.repository.api.account.AccountManager;
import com.flip.connect.domain.boundary.CallbackBoundary;
import com.flip.connect.domain.model.account.Account;
import com.flip.connect.domain.repository.AccountRepository;
import com.flip.connect.presentation.categories.Category;

import java.util.ArrayList;
import java.util.List;

import static com.flip.connect.presentation.categories.Category.emails;
import static com.flip.connect.presentation.categories.Category.phones;
import static com.flip.connect.presentation.categories.Category.publicProfile;

/**
 * Created by Kanda on 13/07/2017.
 */

public class EditUseCase {
    private AccountRepository manager;

    public EditUseCase() {
        manager = new AccountManager();
    }

    public void ClientInformations(List<Category> categories, CallbackBoundary<List<Object>> callbackBoundary) {
        if (!intersection(categories, getCategoriesAccount()).isEmpty()) {
            manager.getAccount(new CallbackBoundary<Account>() {
                @Override
                public void success(Account response) {

                }

                @Override
                public void error(Throwable e) {

                }
            });
        }
    }

    private List<Category> getCategoriesAccount() {
        List<Category> categories = new ArrayList<>();
        categories.add(emails);
        categories.add(phones);
        categories.add(publicProfile);
        return categories;
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

}
