create table lembretes (
    id bigint not null auto_increment,
    titulo varchar(50) not null,
    texto varchar(100) not null,
    data_criacao_lembrete date not null,
    data_lembrete date not null,

    primary key (id)
);