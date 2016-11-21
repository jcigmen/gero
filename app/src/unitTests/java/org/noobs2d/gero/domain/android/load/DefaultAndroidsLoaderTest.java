package org.noobs2d.gero.domain.android.load;

import org.junit.Before;
import org.junit.Test;
import org.noobs2d.gero.TestData;
import org.noobs2d.gero.data.android.entity.Android;
import org.noobs2d.gero.data.android.repository.web.load.LoadAndroidsWebService;

import java.util.List;

import io.reactivex.Observable;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.noobs2d.gero.TestData.androids;

/**
 * @author Julious Igmen
 */
public class DefaultAndroidsLoaderTest {

    private DefaultAndroidsLoader androidsLoader;

    @Before
    public void setUp() throws Exception {
        LoadAndroidsWebService webService = mock(LoadAndroidsWebService.class);
        androidsLoader = new DefaultAndroidsLoader(webService);
    }

    @Test
    public void loadFromServer() throws Exception {
        given(androidsLoader.webService.load())
            .willReturn(Observable.fromCallable(TestData::androids));

        androidsLoader.loadFromServer()
                      .subscribe(loadedAndroids ->
                                     assertThat(loadedAndroids).isEqualTo(androids()));
    }
}