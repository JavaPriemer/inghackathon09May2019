package com.hcl.inghackathon.service.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.repository.SourceRepository;

@RunWith(MockitoJUnitRunner.class)
public class SourceServiceImplTest {
	@InjectMocks
	SourceServiceImpl sourceServiceImpl;
	@Mock
	SourceRepository sourceRepository;

	@Test
	public void testGetSuccessfulTransactions() {
		Source source = new Source();
		List<Source> list = new ArrayList();
		list.add(new Source(1L, new Date(), 1L, 1L, "v", "p"));
		list.add(new Source(2L, new Date(), 2L, 2L, "v", "p"));
		Mockito.when(sourceServiceImpl.getSuccessfulTransactions()).thenReturn(list);
		List<Source> list1 = sourceServiceImpl.getSuccessfulTransactions();
		assertEquals(list, list1);
	}

}