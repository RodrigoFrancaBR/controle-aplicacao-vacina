insert into TB_VACINA (NOME, FORMA_APLICAR, INDICACAO, QUANDO_TOMAR, BENEFICIOS) 
values
('BCG',
'Por via intradérmica (injeção sob a pele) de preferência no braço direito...',
'Todas as crianças.',
'Após o nascimento, na maternidade, em apenas uma dose.',
'Proteção contra as formas graves da tuberculose...'),
('VOP',
'Por via oral. Em três doses, com intervalo de sessenta dias entre cada dose...', 
'Todas as crianças menores de cinco anos, a partir de dois meses de idade.',
'Aos dois, quatro e seis meses de idade, com reforço aos quinze meses...',
'Proteção contra a poliomielite ou paralisia infantil, doença contagiosa...'),
('Tetravalente',
'Por injeção via intramuscular no vasto lateral da coxa...', 
'Todas as crianças.',
'Aos dois, quatro e seis meses. Aos quinze meses...',
'Proteção contra a difteria, o tétano, a coqueluche e a Haemophilus...'),
('Tríplice Viral',
'Por injeção via subcutânea (sob a pele)...', 
'Todas as crianças.',
'Aos doze meses de idade e nos momentos em que ocorrerem as campanhas...',
'Proteção contra o sarampo, a rubéola e a caxumba...'),
('Dupla Viral',
'Por injeção subcutânea na parte superior do braço...', 
'Todos os adolescentes que não foram vacinados quando crianças...',
'A qualquer momento...',
'Proteção contra o sarampo e a rubéola...');	

insert into tb_pessoa (nome,email,cpf, dt_nascimento)
 values 
('JOSE COSTA DIAS','paulo@paulo.com','62394444053','1998-03-04'),
('Andreia Cartaxo Mchado','andreia@andreia.com','43862868028','1985-04-01'),
('Lorenzo Milheirão Cabral','lorenzo@lorenzo.com','89859650004','1980-02-09'),
('Cândida Belém Torquato','candida@candida.com','46002110062','1995-08-03'),
('Harry Maia Meireles','harry@harry.com','67406544090','1982-02-01');
