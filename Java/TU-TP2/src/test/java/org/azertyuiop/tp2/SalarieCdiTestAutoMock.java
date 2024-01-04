package org.azertyuiop.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SalarieCdiTestAutoMock {

    @InjectMocks
    private SalarieCdi salarieCdi;

    @Mock
    private Salaire salaireMock;

    @Mock
    private Identite identiteMock;

    @BeforeEach
    public void setUp() {
        salarieCdi.salaire = salaireMock;
        salarieCdi.identite = identiteMock;
    }

    @Test
    public void testTravailler(){
        salarieCdi.travailler();
        verify(identiteMock).getNomComplet();
        verify(salaireMock).payer(anyDouble());

    }

}
